module.exports = function bubbleSort(numbers) {
    let swapped;
    do {
        swapped = false;

        const lastIndex = numbers.length - 1;

        for (let index = 0; index < lastIndex; index++) {
            let nextIndex = index + 1;
            if (numbers[index] <= numbers[nextIndex]) continue;

            let memory = numbers[index];
            numbers[index] = numbers[nextIndex];
            numbers[nextIndex] = memory;

            swapped = true;
        }

    } while (swapped);
}