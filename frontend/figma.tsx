import './styles.scss'
import "@fontsource/comfortaa";
import "./index.css"
import "./assets/fonts/Comfortaa-VariableFont_wght.ttf"
import calend from "./calend.png";
import crab from "./crab.png";
import person from "./person.png";
import google from "./google.png";
import twitter from "./twitter.png";
import facebook from "./facebook.png";
import React,{useState} from 'react';
function Figma(){
    const [count, setCount] = useState(0);
    function handleClickCreate(){
        //alert("Created!")
        setCount(1);
    }
    function handleClickForgot(){
        alert("You can create a new password!")
    }
    function handleClickSign(){
        alert("Ok!")
    }
    if(count==0){return(
        <div>
             <div className="backgroundimage1" style={{
          backgroundImage:
            "url(../src/top2.png)"}}>
                <div className="backgroundimage2" style={{ backgroundImage: "url(../src/top1.png)"}}>
                    <div style={{display: "flex", justifyContent: "center", alignItems: "center",  height: "100%"}}>
                        <img src={calend} width={88} height={80} alt="calend" />
                    </div>
                </div>
            </div>
            <div className='hello'>
                <label>Hello</label>
            </div>
            <div className='sign'>
                <label>Sign in to your account</label>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="team@gmail.com" /></label>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="password" /></label>
            </div>
            <div className="forgot" style={{marginTop:"30px"}}>
                <button className="button" style={{marginRight:"10px"}} onClick={handleClickForgot}>Forgot your password?</button>           
                <button className="button" style={{marginLeft:"10px", fontSize: "35px", fontWeight: "bold"}} onClick={handleClickSign}>Sign in</button>
            </div>
            <div className="donthave" style={{marginTop:"30px"}}>
                <label style={{ whiteSpace: "nowrap", marginRight:"10px"}}>Don't have an account?</label>
                <button className="button" style={{ fontWeight: "bold"}} onClick={handleClickCreate}>Create</button>
            </div>
            <div style={{display: "flex", justifyContent: "center", alignItems: "center",  height: "100%"}}>
                        <img src={crab} width={88} height={80} alt="calend" />
                    </div>
        </div>
    );}
    if(count==1){return(
        <div>
             <div className="backgroundimage1" style={{backgroundImage: "url(../src/top2.png)"}}>
                <div className="backgroundimage2" style={{ backgroundImage: "url(../src/top1.png)"}}>
                <div className="backgroundimage3" style={{ backgroundImage: "url(../src/white_circle.png)"}}>
                    <div style={{display: "flex", justifyContent: "center", alignItems: "center",  height: "100%"}}>
                        <img src={person} width={67} height={67} alt="person" />
                    </div>
                    </div>
                </div>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="First Name*" /></label>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="Last Name*" /></label>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="E-Mail Adress*" /></label>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="Mobile Number" /></label>
            </div>
            <div className="input" style={{marginTop:"30px"}} >
                <label><input className='input' type="text" placeholder="Password*" /></label>
            </div>
            <div className='accept' style={{marginTop:"30px", whiteSpace: "nowrap"}}>
                <label><input className='check' type="checkbox" checked={false}/></label>
                <label style={{marginLeft:"10px"}}>I accept all terms and conditions</label>
            </div>
            <div className="forgot" style={{marginTop:"20px"}}>          
                <button className="button" style={{fontSize: "35px", fontWeight: "700"}} onClick={handleClickSign}>Sign in</button>
            </div>
            <div className='accept' style={{marginTop:"20px", whiteSpace: "nowrap"}}>
                <label>Or create account using social media</label>
            </div>
            <div style={{marginTop:"15px", display: "flex", justifyContent: "center", alignItems: "center",  height: "100%"}}>
                        <img src={google} width={50} height={50} alt="google" />
                        <img src={twitter} width={50} height={50} alt="twitter" />
                        <img src={facebook} width={50} height={50} alt="facebook" />
                    </div>
        </div>
    );}
}
export default Figma