import styles from './Avatar.module.css';

export function Avatar(props) {
    return (
        <img className={styles.img} src={props.src} alt="" />
    )
}