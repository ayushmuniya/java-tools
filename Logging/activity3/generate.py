########################################################################
#
# DO NOT CHANGE THIS FILE
#
# generate.py
# Generates sample logs for requests to server
########################################################################

from datetime import datetime, timedelta
import random

def generate():
    """
    Function to generate server log file.
    Log files show requests are aggregated at a 5 minute window.
    """
    
    start_time = datetime(year=2021, month=1, day=1, hour=0, minute=0, second=0)
    current_time = start_time
    end_time = start_time + timedelta(weeks=1)
    log_file = open('server_log', 'w')
    log_format = "{timestamp} | {message} | {loglevel}"

    while current_time < end_time:
        if current_time.hour >= 21 or current_time.hour < 3:
            rps = 800 + random.randint(50, 200)
        elif current_time.hour >= 3 and current_time.hour < 9:
            rps = 600 + random.randint(50, 200)
        elif current_time.hour >= 9 and current_time.hour < 18:
            rps = 200 + random.randint(100, 200)
        else:
            rps = random.randint(400, 700)
        
        message = "Requests per second: " + str(rps)
        
        log_record = log_format.format(timestamp=current_time, message=message, loglevel="INFO")
        log_file.write(log_record)
        log_file.write("\n")
            
        # increment to the next 5 minute window
        current_time += timedelta(minutes=5)

if __name__ == "__main__":
    generate()
