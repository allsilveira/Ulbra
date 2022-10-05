// o usuário me informa um número e uma base...
// transformar o array em número

function binaryToDecimal (numero){
    var arrNumero = numero.split('');

    console.log(arrNumero)
    console.log(arrNumero.length + "" + typeof(numero) + typeof(arrNumero));

    var posicao = arrNumero.length - 1;
    var resultFormulanoAlgarismo=0
    var resultFinal=0;

    for (i=arrNumero.length -1; i>=0; i++){
        console.log(arrNumero[i])

        //pra cada numero aplicar a*b**p e guardar este resultado 
        //e incrementar sempre nesse resultado até o final do array

        resultFormulanoAlgarismo = (arrNumero[i]*(2**posicao));
        console.log(`a*b**2 ${resultFormulanoAlgarismo}`);
        resultFinal = resultFinal +  resultFormulanoAlgarismo;
        console.log(`resultFinal = ${resultFormulanoAlgarismo}`)
        posicao--;
    }
    
    return resultFinal;


}