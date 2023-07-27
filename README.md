# Online bus booking
To demonstrate how an online bus booking system works

# Bus Ticket Booking System

Welcome to the Bus Ticket Booking System! This project aims to provide users with a convenient way to search for and book bus tickets online. The system offers a user-friendly interface and various functionalities to streamline the ticket booking process.

## User Story

As a user, I want to be able to search for and book bus tickets online through the Bus Ticket Booking System. The system should allow me to perform the following tasks:

1. **Search for Buses**:
   - Enter the source and destination cities.
   - Select a preferred travel date.
   - Click on the "Search Bus" button to view available buses.

2. **View Search Results**:
   - See a list of available buses with details like bus name, type, available seats, departure and arrival times, duration, fare, and amenities.
   - Have the option to filter search results based on bus type, price range, and amenities to narrow down options.

3. **View Bus Details**:
   - Click on a specific bus to access more detailed information, such as cancellation policies, amenities, and seating options.

4. **Select Seats**:
   - Choose seats by clicking on them.
   - View selected seats with class (lower or upper) and seat number.
   - Be able to select up to six seats and deselect them by clicking on them again.

5. **Ticket and Price Details**:
   - Proceed to the ticket and price details section after selecting seats.
   - View ticket-related information on the left side and price details on the right side.
   - Calculate the price based on the number of passengers and applied discounts (if any).

6. **Apply Coupons**:
   - Have the option to apply a coupon code to avail discounts on the total price.

7. **Enter Passenger Details**:
   - Provide necessary passenger information, including name, gender, age, email, and phone number.
   - Ensure proper validation is in place for each field to ensure accurate data entry.

## Tasks

To develop the Online Bus Ticket Booking System, we will use Spring Boot for the backend and AngularJS for the frontend. The project includes the following tasks:

1. **Implement the backend using Spring Boot**:
   - Create APIs to handle bus search, seat selection, and booking processes.
   - Integrate with a database to store bus information and user details.

2. **Develop the frontend using AngularJS**:
   - Create a user-friendly interface with the home page, search result page, and seat selection page.
   - Implement the filter options for bus type, price range, and amenities.

3. **Implement seat selection functionality**:
   - Allow users to select seats by clicking on them.
   - Display the selected seats in a box on the left side with class and seat numbers.
   - Limit seat selection to a maximum of six seats.

4. **Calculate ticket price and display details**:
   - Calculate the total price based on the number of selected seats and applied discounts.
   - Show ticket-related information on the left side and price details on the right side.

5. **Implement coupon code functionality**:
   - Allow users to enter coupon codes and apply discounts to the total price.

6. **Create a form for passenger details**:
   - Design a form to collect passenger information, including name, gender, age, email, and phone number.
   - Implement validation for each field to ensure correct data entry.

7. **Ensure proper CSS styling**:
   - Develop the website layout and design using CSS.
   - Use CSS to create small rectangles with different colors to indicate seat availability.

8. **Implement the booking process**:
   - Finalize the booking process after seat selection and passenger details entry.
   - Store the booking details in the database and provide a confirmation to the user.

9. **Test the application**:
   - Conduct thorough testing to ensure all features are working correctly.
   - Perform validation testing to check data entry and error handling.

10. **Deploy the application**:
    - Deploy the backend on the Spring Tool Suite (STS) IDE, running on port 9090.
    - Deploy the frontend on Visual Studio Code, running on port 4200.
    - Verify that the application works seamlessly in a live environment.

