import { useState } from 'react'
import './App.css'
import { ParticipantCard } from './components/ParticipantCard'
import { Header } from './components/Header'
import styles from './components/ParticipantCard.module.css';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header/>
      <div className={styles.container}>
        <ParticipantCard/>
        <ParticipantCard/>
        <ParticipantCard/>
      </div>
    </>
  )
}

export default App
