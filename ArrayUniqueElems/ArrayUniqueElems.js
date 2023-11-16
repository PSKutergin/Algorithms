const phoneNumbers = [79160203040, 79160203042, 79160203041, 79160203040, 79160203041, 79160203045, 79160203043];

const uniqueNumbers = new Set(phoneNumbers); // создаём коллекцию уникальных значений
console.log(Array.from(uniqueNumbers));