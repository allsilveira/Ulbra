import { Avatar } from "./Avatar";
import styles from './ParticipantCard.module.css';

export function ParticipantCard() {
    return (
        <div className={styles.card}>
           <Avatar src="https://img.freepik.com/vetores-premium/icone-de-perfil-de-usuario-em-estilo-plano-ilustracao-em-vetor-avatar-membro-em-fundo-isolado-conceito-de-negocio-de-sinal-de-permissao-humana_157943-15752.jpg"/>
            <span>Nome</span>
            <span>Participante</span>
            <span>Confirmado</span>
        </div>
    )
}