# Use the official OpenJDK image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the Java source file to the container
COPY MarksCalculator.java .

# Compile the Java source file
RUN javac MarksCalculator.java

# Run the compiled Java program
CMD ["java", "MarksCalculator"]
