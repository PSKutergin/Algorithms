const ages = [10, 6, 15, 93, 42, 7, 32];

const findMaxUnderBoundary = (inputArray, topBoundary) => {
    let currentMax = Number.MIN_VALUE;

    for (let i = 0; i < inputArray.length; i++) {
        if (inputArray[i] < topBoundary) {
            currentMax = Math.max(currentMax, inputArray[i])
        }
    };

    return currentMax;
};

const findTopElement = (inputArray, numberOfElements) => {
    const topElements = [];

    let previousMax = Number.MAX_VALUE;

    for (let i = 0; i < numberOfElements; i++) {
        let currentMax = findMaxUnderBoundary(inputArray, previousMax);
        previousMax = currentMax;
        topElements[i] = currentMax;
    }

    return topElements;
}

let top3age = findTopElement(ages, 3)

console.log(top3age);