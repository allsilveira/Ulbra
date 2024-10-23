import styles from './Avatar.module.css';

export function Avatar(props) {
    return (
        <img className={styles.img} src={props.src} alt="" />
        // <img className={styles.img} src="https://img.freepik.com/vetores-premium/icone-de-perfil-de-usuario-em-estilo-plano-ilustracao-em-vetor-avatar-membro-em-fundo-isolado-conceito-de-negocio-de-sinal-de-permissao-humana_157943-15752.jpg" alt="" />
    )
}