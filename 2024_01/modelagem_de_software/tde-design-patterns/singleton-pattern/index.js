const GenericDatabase = require('./src/infra/database/GenericDatabase.js');

const db1 = GenericDatabase();
const db2 = GenericDatabase();

db1.connection.connect();
db1.connection.query('SELECT * FROM table_name');
db1.connection.close();

console.log(`Is generic database singleton? ${db1 === db2}`);