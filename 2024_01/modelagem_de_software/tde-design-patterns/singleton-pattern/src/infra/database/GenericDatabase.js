function GenericDatabase() {
    if (GenericDatabase._instance) return GenericDatabase._instance;

    this.connection = {
        connect: function () {
            console.log('Conectado ao banco de dados.');
        },
        query: function (sql) {
            console.log(`Executando a query: ${sql}`);
        },
        close: function () {
            console.log('Conexão com o banco de dados fechada.');
        }
    };

    GenericDatabase._instance = this;
    return this;
}

module.exports = GenericDatabase;