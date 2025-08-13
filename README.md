# Nandu 

This project solves a logic puzzle involving LEDs based on input from a text file. It is my solution to the first Junioraufgabe of the BWINF42.

## Project Structure

- `Eingabe.txt`: Input file with the puzzle configuration.
- `Ausgabe.txt`: Output file with the results.
- `LEDs - mit DEBUG Tools/`: Source code and debug tools.
- `LEDs - Abgabe/`: Submission version.

## How to Run

1. Make sure you have Java installed.
2. Open the `LEDs - mit DEBUG Tools` folder.
3. Compile the Java files in the `src` directory:
   ```
   javac -d bin src/*.java
   ```
4. Run the program:
   ```
   java -cp bin App
   ```

## Files

- `App.java`: Main application entry point.
- `FileReaderx.java`: Reads and parses the input file.
- `LEDberechner.java`: Contains the logic for calculating the LED states.
- `FileCreator.java`: Writes the results to the output file.
- `Printer.java`: Utility for printing arrays (for debugging).

## Input Format

The input file (`Eingabe.txt`) should have the following format:
```
<width> <height>
<row 1>
<row 2>
...
<row n>
```

## Output

The result will be written to `Ausgabe.txt` and printed to the console.

## License

This projekt is under the MIT License.