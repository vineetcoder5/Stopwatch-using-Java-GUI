# Stopwatch Java Swing Application

This simple Java Swing application implements a stopwatch with start and stop functionality. The stopwatch displays elapsed time in seconds and milliseconds.

Features
Start button: Initiates the stopwatch, updating the display every 10 milliseconds.
Stop button: Halts the stopwatch and displays the elapsed time.
How to Use
Click the "Start" button to begin the stopwatch.
Click the "Stop" button to pause the stopwatch and view the elapsed time.
The display shows the elapsed time in seconds and milliseconds.
Implementation Details
The stopwatch runs in a separate thread to allow continuous updates without freezing the GUI.
The display is a JTextField showing elapsed time in the format "seconds.milliseconds."
The application uses Java Swing for the graphical user interface.
Code Structure
The StopwatchThread class is responsible for the stopwatch logic.
The main method initializes the GUI components, buttons, and event listeners.
Clicking the "Start" button creates a new thread for the stopwatch.
Clicking the "Stop" button sets the stop_state variable to false, stopping the stopwatch.
Requirements
Java Development Kit (JDK) installed on your machine.
An Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.
How to Run
Clone the repository to your local machine.
Open the project in your preferred Java IDE.
Compile and run the stopwatch.java file.
The GUI window will appear, allowing you to interact with the stopwatch.
Example

Contributing
Feel free to contribute to the project by submitting issues or pull requests.
