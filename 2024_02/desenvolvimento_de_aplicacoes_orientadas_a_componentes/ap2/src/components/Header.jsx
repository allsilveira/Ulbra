import { Avatar } from './Avatar';
import styles from './Header.module.css';

export function Header() {
    return (
        <header className={styles.header}>
            <h1>AP2</h1>
            <Avatar src="https://yt3.googleusercontent.com/1b07kW4rals2FQ04zL6ku8EiLI3E9RJLoMCSY09NQv9n-BbXGgPhhydIb3DLhx4h5LImW9dWuQ=s160-c-k-c0x00ffffff-no-rj"/>
        </header>
    ) 
}