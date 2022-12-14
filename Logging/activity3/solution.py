from datetime import datetime
import collections

def analyze():
    log_file = open('server_log', 'r')
    aggregate = {h:0 for h in range(0, 24)}

    # Accumulate in the hourly window
    for log_record in log_file.readlines():
        datetime_str = log_record.split("|")[0]
        rps = int(log_record.split("|")[1].split(":")[1])
        dt = datetime.strptime(datetime_str, "%Y-%m-%d %H:%M:%S ") # note the space at the end
        aggregate[dt.hour] += rps
    
    # Average to get the requests per hour
    # 5 minute intervals over an hour for a week worth of log records = 12 * 7
    for hour in aggregate.keys():
        aggregate[hour] = aggregate[hour] / (12 * 7)
    
    # Sort by value to get the hours where usage was highest
    aggregate = dict(sorted(aggregate.items(), key=lambda item: item[1], reverse=True))

    # Print the hours
    for item in aggregate.items():
        if item[1] > 800:
            print("Increase server capacity at hour : ", item[0])

if __name__ == "__main__":
    analyze()
