import { useState } from 'react'
import './App.css'
import { ParticipantCard } from './components/ParticipantCard'
import { Header } from './components/Header'
import styles from './components/ParticipantCard.module.css';
import { ParticipantForm } from './components/ParticipantForm';
import { Location } from './components/Location';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header/>
      <div className={styles.container}>
        <div>
          <ParticipantForm/>
          <Location/>
        </div>
        <div className={styles.container}>
          <ParticipantCard/>
          <ParticipantCard/>
          <ParticipantCard/>
        </div>
      </div>
    </>
  )
}

export default App
