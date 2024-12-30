import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.SQLException;
import com.google.gson.Gson;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import Models.User;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {
        logger.info("Запуск приложения");

        try {
            UserDAO userDAO = new UserDAOImpl();
            logger.debug("UserDAO успешно инициализирован");

            User loser = userDAO.get(1);
            if (loser != null) {
                logger.info("Пользователь найден: ID = {}", loser.getUserId());
            } else {
                logger.warn("Пользователь с ID = 1 не найден");
            }

            String loserGson = new Gson().toJson(loser);
            logger.debug("Пользователь преобразован в JSON: {}", loserGson);
            System.out.print(loserGson);

        } catch (SQLException e) {
            logger.error("Ошибка при работе с базой данных: {}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            logger.error("Неожиданная ошибка: {}", e.getMessage(), e);
            throw e;
        }

        logger.info("Приложение завершило работу");
    }
}
