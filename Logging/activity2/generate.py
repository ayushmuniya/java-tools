########################################################################
#
# DO NOT CHANGE THIS FILE
#
# generate.py
# Generates sample logs which simulates logs across a distributed system
########################################################################

import random

from datetime import datetime, timedelta


def generate():
    """
    Function to generate the logs as if it is from multiple machines.
    """

    # base variables
    server_names_and_logs = {
        'server-a5js6': open('server-a5js6_log', 'w'), 
        'server-8qhhs': open('server-8qhhs_log', 'w'),
        'server-9ms31': open('server-9ms31_log', 'w')
    }
    start_time = datetime.now()
    current_time = start_time
    end_time = start_time + timedelta(hours=2)
    log_format = "{timestamp} | {machine} | {loglevel} | {message} | {line}"
    event_types = ['normal', 'error']
    normal_event_messages = [
        "Logging event.",
        "Message has been published.",
        "Message received correctly.",
        "Code flow successfully terminated.",
        "Sub-system started successfully."
    ]
    error_event_messages = [
        "java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to given class.",
        "java.net.SocketException: Socket timed out! Reconnecting."
        "java.lang.NullPointerException: Could not find value of the object, using default."
    ]
    
    # For every few minutes generate a log in any machine from the event list

    servers = list(server_names_and_logs.keys())

    while current_time < end_time:
        # generate event with timestamp
        timestamp = current_time
        machine = random.choice(servers)
        
        chance = random.randint(1, 100)
        # Reduce the probability of generating error message
        if chance > 80:
            loglevel = 'ERROR'
            message = random.choice(error_event_messages)
            line = "Line: " + str(random.randint(20, 200))
        else:
            loglevel = 'INFO'
            message = random.choice(normal_event_messages)
            line = ' - '
        
        log_record = log_format.format(
            timestamp=timestamp, 
            machine=machine, 
            loglevel=loglevel, 
            message=message, 
            line=line
        )

        # put event in server's respective log file
        log_file = server_names_and_logs.get(machine)
        log_file.write(log_record)
        log_file.write("\n")
        
        # add few minutes to current_time
        add_minutes = random.randint(1,5)
        current_time += timedelta(minutes=add_minutes)
    
    # close file handles
    for server in server_names_and_logs.keys():
        server_names_and_logs.get(server).close()

if __name__ == "__main__":
    generate()
