def calculate_average(data_list):
    if not data_list:
        return 0

    total_sum = 0
    print("--- Calculating Sum ---")
    for number in data_list:
        total_sum += number  # Add the current number to the running total
        print(f"Adding {number}. Current sum is: {total_sum}")

    count = len(data_list) 
    average = total_sum / count
    
    return average

scores = [85, 92, 78, 95, 88, 90]

print(f"The list of scores is: {scores}")

avg_result = calculate_average(scores)

print("\n--- Final Result ---")
print(f"Total number of scores: {len(scores)}")
print(f"The average score is: {avg_result:.2f}")