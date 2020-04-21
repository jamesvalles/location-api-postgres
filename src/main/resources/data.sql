DROP TABLE IF EXISTS location_data;

CREATE TABLE location_data
(
    Zipcode      INT,
    City         VARCHAR(255),
    State        VARCHAR(255),
    Abbreviation VARCHAR(255),
    County       VARCHAR(255),
    Lat          DECIMAL,
    Longitude    DECIMAL
); AS
SELECT *
FROM CSVREAD ('zips.csv');

