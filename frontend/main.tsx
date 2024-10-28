import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './styles.scss'
import Figma from './figma.tsx'
import React from 'react'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
  <Figma />
  </StrictMode>,
)