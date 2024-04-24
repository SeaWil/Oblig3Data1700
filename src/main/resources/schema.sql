CREATE TABLE ticket
(
--film, amount, fName, sName, phoneNumber, email
    film        VARCHAR(255) NOT NULL,
    amount      VARCHAR(255) NOT NULL,
    fName       VARCHAR(255) NOT NULL,
    sName       VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(255) NOT NULL,
    epost       VARCHAR(255) NOT NULL,
    PRIMARY KEY (fName, phoneNumber)
);