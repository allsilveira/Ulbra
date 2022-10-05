var base = parseFloat(prompt('Digite um número para a base:'))
var expoente = parseFloat(prompt('Digite um número para o expoente:'))
var resultado 

for(op=0; op <= expoente; op++){
    if(op >= 0){
        resultado = base**op
        console.log(`${base}^${op} é igual a ${resultado}`)
        /*ou  alert(`${base}^${op} é igual a ${resultado}`)*/
    }
}

