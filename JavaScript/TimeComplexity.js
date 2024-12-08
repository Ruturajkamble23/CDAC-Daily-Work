
function quadratic(seconds, input1, input2) {
    const result = (Math.pow(input2, 2) * seconds) / Math.pow(input1, 2);
    return result.toFixed(3);
}

function cubic(seconds, input1, input2) {
    const result = (Math.pow(input2, 3) * seconds) / Math.pow(input1, 3);
    return result.toFixed(3);
}

function logarithmic(seconds, input1, input2) {
    const logInput1 = Math.log10(input1);
    const logInput2 = Math.log10(input2);
    const result = (logInput2 / logInput1) * seconds;
    return result.toFixed(3);
}

function linear(seconds, input1, input2) {
    const result = (input2 * seconds) / input1;
    return result.toFixed(3);
}

document.getElementById("calculateButton").addEventListener("click", function() {
    const seconds = parseFloat(document.getElementById("seconds").value);
    const input1 = parseFloat(document.getElementById("input1").value);
    const input2 = parseFloat(document.getElementById("input2").value);
    const method = document.getElementById("method").value;

    let result;

    if (isNaN(seconds) || isNaN(input1) || isNaN(input2)) {
        document.getElementById("result").innerText = "Please enter valid numbers for all inputs.";
        return;
    }

    switch (method) {
        case 'quadratic':
            result = quadratic(seconds, input1, input2);
            document.getElementById("result").innerText = `Quadratic Time Complexity: ${result} sec`;
            break;
        case 'cubic':
            result = cubic(seconds, input1, input2);
            document.getElementById("result").innerText = `Cubic Time Complexity: ${result} sec`;
            break;
        case 'logarithmic':
            result = logarithmic(seconds, input1, input2);
            document.getElementById("result").innerText = `Logarithmic Time Complexity: ${result} sec`;
            break;
        case 'linear':
            result = linear(seconds, input1, input2);
            document.getElementById("result").innerText = `Linear Time Complexity: ${result} sec`;
            break;
        default:
            document.getElementById("result").innerText = "Please select a valid time complexity type.";
            break;
    }
});
