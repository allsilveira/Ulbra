import { Avatar } from "./Avatar";
import styles from './ParticipantCard.module.css';

export function ParticipantCard(props) {
    return (
        <div className={styles.card}>
           <Avatar src={props.participant.imageUrl}/>
            <span>{props.participant.name}</span>
            <span>{props.participant.guest == "true"? "Egresso/Convidado" : "Estudante"}</span>
            <span>{props.participant.paid == "true"? "Confirmado" : "Não confirmado"}</span>
        </div>
    )
}