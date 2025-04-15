<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Compound Interest Calculator</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
<div class="bg-white p-8 rounded-lg shadow-md w-full max-w-md">
    <h1 class="text-2xl font-bold text-center text-gray-800 mb-6">Compound Interest Calculator</h1>
    <h3 class="bg-red-300 text-red-900 font-semiblod text-sm w-full text-center rounded-lg my-2 mx-auto">${error}</h3>
    <form action="/" method="post" class="space-y-4">
        <div>
            <label for="principalAmount" class="block text-sm font-medium text-gray-700">Principal Amount <span class="text-gray-500">$</span></label>
            <input type="number" id="principalAmount" name="principalAmount" placeholder="${principalAmount}"
                   class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500">
        </div>
        <div>
            <label for="interestPercentage" class="block text-sm font-medium text-gray-700">Annual Interest Rate (%)</label>
            <input type="number" id="interestPercentage" name="interestPercentage" step="0.01" placeholder="${interestPercentage}" min="1" max="100"
                   class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500">
        </div>
        <div>
            <label for="years" class="block text-sm font-medium text-gray-700">Time per Year <span class="text-gray-500">(1 to 12)</span></label>
            <input type="number" id="years" name="years" placeholder="${years}" min="1" max="12"
                   class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500">
        </div>
        <div>
            <label for="compoundingPeriod" class="block text-sm font-medium text-gray-700">Compounding Frequency (per year)</label>
            <input type="number" id="compoundingPeriod" name="compoundingPeriod" placeholder="${compoundingPeriod}"
                   class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500">
        </div>
        <button type="submit"
                class="w-full bg-blue-500 text-white py-2 px-4 rounded-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-offset-2">
            Calculate
        </button>
        <div class="mt-6 p-4 bg-green-100 text-green-800 rounded-lg shadow-md">
            <h2 class="text-lg font-semibold">Result</h2>
            <p class="mt-2">Compound Interest: <span class="font-bold">${result}</span></p>
        </div>
    </form>
</div>
</body>
</html>