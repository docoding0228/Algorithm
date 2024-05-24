# SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.NAME
# FROM ANIMAL_INS
# LEFT JOIN ANIMAL_OUTS
# ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
# WHERE ANIMAL_INS.DATETIME > ANIMAL_OUTS.DATETIME
# ORDER BY ANIMAL_INS.DATETIME

SELECT I.ANIMAL_ID, I.NAME 
FROM ANIMAL_INS AS I JOIN ANIMAL_OUTS AS O 
WHERE I.ANIMAL_ID = O.ANIMAL_ID AND O.DATETIME <= I.DATETIME 
ORDER BY I.DATETIME