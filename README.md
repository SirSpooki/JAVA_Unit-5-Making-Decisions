# Unit-5-Making-Decisions
Exercises 5-1 - 5-10

You Should Decide on whether or not you really want to code the rest of your life

"I got shootas on my side, cuz we aint let no one slide" - 75 Records

SlayTeam 2023

Exercise Instructions
------------------------
5-1
--
Write an application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd. Save the file as EvenOdd.java.

5-2
--
Write an application that asks a user to enter three integers. Display them in ascending and descending order. Save the file as AscendingAndDescending.java.

5-3
--
A. Write an application for the Shady Rest Hotel; the program determines the price of a room. Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch. The output echoes the input and displays the price of the room: $125 for queen, $139 for king, and $165 for suite with king bed and a pullout couch. If the user enters an invalid code, display an appropriate message and set the price to 0. Save the file as ShadyRestRoom.java.

B. Add a prompt to the ShadyRestRoom application to ask the user to specify a

1. lake view or a

2. park view, but ask only if the bed size entry is valid.

Add $15 to the price of any room with a lake view. If the view value is invalid, display an appropriate message and assume that the price is for a room with a lake view. Save the file as ShadyRestRoom2.java.

5-4
--
Write a program for Horizon Phones, a provider of cellular phone service. Prompt a user for maximum monthly values for talk minutes used, text messages sent, and gigabytes of data used, and then recommend the best plan for the customer’s needs. A customer who needs fewer than 500 minutes of talk and no text or data should accept Plan A at $49 per month. A customer who needs fewer than 500 minutes of talk and any text messages should accept Plan B at $55 per month. A customer who needs 500 or more minutes of talk and no data should accept either Plan C for up to 100 text messages at $61 per month or Plan D for 100 text messages or more at $70 per month. A customer who needs any data should accept Plan E for up to 3 gigabytes at $79 or Plan F for 3 gigabytes or more at $87. Save the file as CellPhoneService.java.

5-5
--
A. Write an application that prompts a user for a month, day, and year. Display a message that specifies whether the entered date is

1.not this year,

2.in an earlier month this year,

3.in a later month this year, or

4.this month. Save the file as PastPresentFuture.java.

B. Use the web to learn how to use the LocalDate Boolean methods isBefore(), isAfter(), and equals(). Use your knowledge to write a program that prompts a user for a month, day, and year, and then displays a message specifying whether the entered day is in the past, the current date, or in the future. Save the file as PastPresentFuture2.java.

5-6
--
Acme Parts runs a small factory and employs workers who are paid one of three hourly rates depending on their shift: first shift, $17 per hour; second shift, $18.50 per hour; third shift, $22 per hour. Each factory worker might work any number of hours per week; any hours greater than 40 are paid at one and one-half times the usual rate. In addition, second- and third-shift workers can elect to participate in the retirement plan for which 3% of the worker’s gross pay is deducted from the paychecks. Write a program that prompts the user for hours worked and shift, and, if the shift is 2 or 3, whether the worker elects the retirement. Display:

1.the hours worked,

2.the shift,

3.the hourly pay rate,

4.the regular pay,

5.overtime pay,

6.the total of regular and overtime pay, and

7.the retirement deduction, if any, and

8.the net pay. Save the file as AcmePay.java.

5-7
--
Create a class that holds data about a job applicant. Include a name, a phone number, and four Boolean fields that represent whether the applicant is skilled in each of the following areas: word processing, spreadsheets, databases, and graphics. Include a constructor that accepts values for each of the fields. Also include a get method for each field. Create an application that instantiates several job applicant objects and pass each in turn to a Boolean method that determines whether each applicant is qualified for an interview. Then, in the main() method, display an appropriate method for each applicant. A qualified applicant has at least three of the four skills. Save the files as JobApplicant.java and TestJobApplicants.java.

5-8
--
Create an Automobile class for a dealership. Include fields for an ID number, make, model, color, year, and miles per gallon. Include get and set methods for each field. Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0. Do not allow the year to be earlier than 2005 or later than 2019; if it is, set the year to 0. Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0. Include a constructor that accepts arguments for each field value and uses the set methods to assign the values. Write an application that declares several Automobile objects and demonstrates that all the methods work correctly. Save the files as Automobile.java and TestAutomobiles.java.

5-9
--
Create a class named Apartment that holds an apartment number, number of bedrooms, number of baths, and rent amount. Create a constructor that accepts values for each data field. Also create a get method for each field. Write an application that creates at least five Apartment objects. Then prompt a user to enter a minimum number of bedrooms required, a minimum number of baths required, and a maximum rent the user is willing to pay. Display data for all the Apartment objects that meet the user’s criteria or an appropriate message if no such apartments are available. Save the files as Apartment.java and TestApartments.java.

5-10
--
Use the web to locate the lyrics to the traditional song “The Twelve Days of Christmas.” The song contains a list of gifts received for the holiday. The list is cumulative so that as each “day” passes, a new verse contains all the words of the previous verse, plus a new item. Write an application that displays the words to the song starting with any day the user enters. (Hint: Use a switch statement with cases in descending day order and without any break statements so that the lyrics for any day repeat all the lyrics for previous days.) Save the file as TwelveDays.java.
