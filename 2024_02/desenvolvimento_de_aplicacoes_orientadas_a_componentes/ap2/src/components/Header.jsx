import { Avatar } from './Avatar';
import styles from './Header.module.css';

export function Header(props) {
    return (
        <header className={styles.header}>
            <div>
                <h1>Entrevero</h1>
                <p>Seja bem-vindo, {props.user.name}</p>
            </div>
            <Avatar src="https://yt3.googleusercontent.com/1b07kW4rals2FQ04zL6ku8EiLI3E9RJLoMCSY09NQv9n-BbXGgPhhydIb3DLhx4h5LImW9dWuQ=s160-c-k-c0x00ffffff-no-rj"/>
        </header>
    ) 
}