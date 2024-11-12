import { useState } from 'react';
import styles from './ParticipantForm.module.css';

export function ParticipantForm(props) {
    const [participant, setParticipant] = useState({})
    
    function handleSubmitNewParticipant(event) {
        event.preventDefault()

        props.addParticipant(participant)
        setParticipant({})
        console.log(participant)
    }

    return (
        <form onSubmit={handleSubmitNewParticipant}>
            <div className={styles.formGroup}>
                <label htmlFor="">Nome</label>
                <input 
                    required
                    minlength="3"
                    maxlength="150"
                    type="text" 
                    name="name" 
                    placeholder="Digite seu nome"
                    id="name" 
                    value={participant.name ?? ""}
                    onChange={(event) => setParticipant({...participant, name: event.target.value})} 
                />
            </div>
            <div className={styles.formGroup}>
                <label htmlFor="">Telefone</label>
                <input 
                    required
                    minlength="11"
                    maxlength="12"
                    type="tel" 
                    name="phone" 
                    placeholder="Digite seu telefone"
                    id="phone" 
                    value={participant.phone ?? ""}
                    onChange={(event) => setParticipant({...participant, phone: event.target.value})} 
                />
            </div>
            <div className={styles.formGroup}>
                <label htmlFor="">Egresso/Convidado</label>
                <div>
                    <label>
                        <input 
                            type="radio" 
                            name="guest" 
                            value="true" 
                            onChange={(event) => setParticipant({...participant, guest: event.target.value})} 
                        />
                        Sim
                    </label>
                    <label>
                        <input 
                            type="radio" 
                            name="guest" 
                            value="false" 
                            onChange={(event) => setParticipant({...participant, guest: event.target.value})} 
                        />
                        Não
                    </label>
                </div>
            </div>
            <div className={styles.formGroup}>
                <label htmlFor="">Pago</label>
                <div>
                    <label>
                        <input 
                            type="radio" 
                            name="paid" 
                            value="true" 
                            onChange={(event) => setParticipant({...participant, paid: event.target.value})} 
                        />
                        Sim
                    </label>
                    <label>
                        <input 
                            type="radio" 
                            name="paid" 
                            value="false" 
                            onChange={(event) => setParticipant({...participant, paid: event.target.value})} 
                        />
                        Não
                    </label>
                </div>
            </div>
            <div className={styles.formGroup}>
                <label>Foto</label>
                <input 
                    required
                    type="url" 
                    name="url" 
                    placeholder="URL da imagem"
                    value={participant.imageUrl ?? ""}
                    onChange={(event) => setParticipant({...participant, imageUrl: event.target.value})} 
                />
            </div>

            <button type="submit">Cadastrar</button>
        </form>
    );
}