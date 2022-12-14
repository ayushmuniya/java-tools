from datetime import datetime

def analyze():
    log_file1 = open('server-8qhhs_log', 'r')
    log_file2 = open('server-9ms31_log', 'r')
    log_file3 = open('server-a5js6_log', 'r')
    log_files = [log_file1, log_file2, log_file3]

    # Date time list
    logs = {}

    # Parse log files for dates
    for log_file in log_files:
        for log_record in log_file.readlines():
            log_level = str(log_record.split("|")[2])
            if log_level.find("ERROR") != -1:
                dt_str = log_record.split("|")[0]
                dt = datetime.strptime(dt_str, "%Y-%m-%d %H:%M:%S.%f ") # note the space at the end
                logs[dt] = log_record
    
    logs = dict(sorted(logs.items(), key=lambda item: item[1]))

    print("Datetime sequence of errors across system:")
    for log_record in logs.values():
        print(log_record)
    

if __name__ == "__main__":
    analyze()
