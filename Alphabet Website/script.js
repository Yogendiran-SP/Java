// Function to calculate before and after characters
function calculate() {
    const input = document.getElementById('charInput').value.trim();
    const resultDiv = document.getElementById('result');
    resultDiv.innerHTML = ''; // Clear previous results
    let beforeChar, afterChar;

    // Check if the input is a valid lowercase alphabet.
    if (input.length === 1 && input >= 'a' && input <= 'z') {
        if (input === 'a') {
            beforeChar = String.fromCharCode(input.charCodeAt(0) + 25);
            afterChar = String.fromCharCode(input.charCodeAt(0) + 1);
        } else if (input === 'z') {
            beforeChar = String.fromCharCode(input.charCodeAt(0) - 1);
            afterChar = String.fromCharCode(input.charCodeAt(0) - 25);
        } else {
            beforeChar = String.fromCharCode(input.charCodeAt(0) - 1);
            afterChar = String.fromCharCode(input.charCodeAt(0) + 1);
        }

        resultDiv.innerHTML = `
            <p><strong>You have entered: ${input}</strong></p>
            <p><strong>Before character is: ${beforeChar}</strong></p>
            <p><strong>After character is: ${afterChar}</strong></p>
        `;
    } else {
        resultDiv.innerHTML = '<p class="error">Please enter a valid lowercase alphabet character.</p>';
    }
}

// Event listener to handle the "Enter" key press
document.getElementById('charInput').addEventListener('keypress', function (event) {
    if (event.key === 'Enter') {
        calculate(); // Call the calculate function when Enter is pressed
    }
});
