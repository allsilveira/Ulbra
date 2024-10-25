import styles from './ParticipantForm.module.css';

export function ParticipantForm() {
    return (
        <form>
            <div className={styles.formGroup}>
                <label htmlFor="">Nome</label>
                <input type="text" name="name" id="name" />
            </div>
            <div className={styles.formGroup}>
                <label htmlFor="">Telefone</label>
                <input type="tel" name="phone" id="phone" />
            </div>
            <div className={styles.formGroup}>
                <label htmlFor="">Egresso/Convidado</label>
                <div>
                    <label>
                        <input type="radio" name="radioSimNao1" value="true" />
                        Sim
                    </label>
                    <label>
                        <input type="radio" name="radioSimNao1" value="false" />
                        Não
                    </label>
                </div>
            </div>
            <div className={styles.formGroup}>
                <label htmlFor="">Pago</label>
                <div>
                    <label>
                        <input type="radio" name="radioSimNao2" value="true" />
                        Sim
                    </label>
                    <label>
                        <input type="radio" name="radioSimNao2" value="false" />
                        Não
                    </label>
                </div>
            </div>
            <div className={styles.formGroup}>
                <label>Foto</label>
                <input type="url" name="url" value="url" />
            </div>

            <button type="submit">Cadastrar</button>
        </form>
    );
}