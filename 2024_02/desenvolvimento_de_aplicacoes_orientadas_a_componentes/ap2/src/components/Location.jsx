import { useState, useEffect } from "react"
import styles from './Location.module.css';

export function Location(props) {
    const [location, setLocation] = useState(null)
    const [isLocationShowed, setIsLocationsShowed] = useState(false)

    useEffect(() => {
        if (props.cep.length !== 8) return;
        fetch(`https://viacep.com.br/ws/${props.cep}/json/`)
            .then((res) => res.json())
            .then((data) => {
                setLocation(data);
            })
            .catch((error) => console.log(error));
    }, [props.cep]);

    function handleShowLocation() {
        setIsLocationsShowed(!isLocationShowed)
    }

    return (
        <div>
            <button onClick={handleShowLocation} type="button">Localização</button>
            {isLocationShowed && <div>
                <div className={styles.infoLocation}>
                    <label htmlFor="">CEP:</label>
                    <p>{location.cep}</p>
                </div>
                <div className={styles.infoLocation}>
                    <label htmlFor="">Cidade:</label>
                    <p>{location.localidade}</p>
                </div>
                <div className={styles.infoLocation}>
                    <label htmlFor="">Estado:</label>
                    <p>{location.estado}</p>
                </div>
            </div>}
        </div>
    )
}