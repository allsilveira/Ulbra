import styles from './Profile.module.css'

export default function Profile(props) {
    return (
        <img className={styles.img} src={props.src} alt="" />
    )
}