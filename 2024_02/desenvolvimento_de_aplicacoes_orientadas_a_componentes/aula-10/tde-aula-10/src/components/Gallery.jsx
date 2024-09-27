import Profile from "./Profile";
import styles from './Gallery.module.css';

export default function Gallery() {
    return (
        <div>
            <h1 className={styles.title}>Cientistas incríveis</h1>
            <div className={styles.images}>
                <Profile src="https://quindim.com.br/blog/wp-content/uploads/2021/12/Mulheres-cientistas-Katherine-Johnson.jpg"/>
                <Profile src="https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2022/02/Maria_Telkes_NYWTS.jpg?w=397"/>
                <Profile src="https://revista-cdn.querobolsa.com.br/post_images/49146/e9019e0df8f44023f9c1ed69b0f754c617dfb457.jpg?1709669298"/>
            </div>
        </div>
    )
}