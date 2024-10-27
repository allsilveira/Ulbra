import { useState } from 'react'
import { ParticipantCard } from './components/ParticipantCard'
import { Header } from './components/Header'
import styles from './App.module.css';
import { ParticipantForm } from './components/ParticipantForm';
import { Location } from './components/Location';
import { sortAlphabetically } from './utils/sort-alphabetically'

function App() {
  const user = {
    name: "Daniel"
  }

  const [participants, setParticipants] = useState([
    {
      name: "Alessandra",
      phone: "980368454",
      guest: "true",
      paid: "true",
      imageUrl: "https://avatars.githubusercontent.com/u/87390902?v=4"
    },
    {
      name: "Ygor",
      phone: "983313468",
      guest: "false",
      paid: "false",
      imageUrl: "https://avatars.githubusercontent.com/u/101815412?v=4"
    }
  ]);

  function handleAddNewParticipant(newParticipant) {
    setParticipants([...participants, newParticipant])
  }

  return (
    <>
      <Header user={user}/>
      <div className={styles.container}>
        <div>
          <ParticipantForm addParticipant={handleAddNewParticipant}/>
          <Location cep="95535000"/>
        </div>
          <ul className={styles.participantsList}>
            {participants
            .sort(sortAlphabetically)
            .map((participant) => {
              return <li key={participant.phone}>
                <ParticipantCard participant={participant}/>
              </li> 
            })}
          </ul>

      </div>
    </>
  )
}

export default App
