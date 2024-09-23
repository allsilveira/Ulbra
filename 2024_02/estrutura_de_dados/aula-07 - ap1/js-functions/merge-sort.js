module.exports = function mergeSort(numbers) {
    if (numbers.length <= 1) return numbers;

    const middle = Math.floor(numbers.length / 2);

    const leftArray = numbers.slice(0, middle);
    const rightArray = numbers.slice(middle);

    return merge(mergeSort(leftArray), mergeSort(rightArray));
}


function merge(leftArray, rightArray) {
    let sortedArray = [];
    let leftIndex = 0;
    let rightIndex = 0;

    while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
        if (leftArray[leftIndex] < rightArray[rightIndex]) {
            sortedArray.push(leftArray[leftIndex]);
            leftIndex++;
        } else {
            sortedArray.push(rightArray[rightIndex]);
            rightIndex++;
        }
    }

    while (leftIndex < leftArray.length) {
        sortedArray.push(leftArray[leftIndex]);
        leftIndex++;
    }

    while (rightIndex < rightArray.length) {
        sortedArray.push(rightArray[rightIndex]);
        rightIndex++;
    }

    return sortedArray;
}