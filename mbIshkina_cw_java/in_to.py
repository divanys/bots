import json

def read_file(way_to_file):
    with open(way_to_file, 'r') as file:
        all_data = file.readlines()
    return all_data

def in_to(lst_str):
    data = {}
    name_now = None
    task_now = []

    for i in lst_str:
        if i.startswith('pz_'):
            if name_now is not None:
                data[name_now] = task_now
            name_now = i.strip()
            task_now = []
        else:
            task_now.extend(i.split())

    if name_now is not None:
        data[name_now] = task_now

    return data

def save_in_json(data, way_to_file):
    with open(way_to_file, 'w', encoding='utf-8') as file:
        json.dump(data, file, ensure_ascii=False)

way_to_file = 'pz.txt'
lst_str = read_file(way_to_file)
data = in_to(lst_str)
way_to_file_tasks = 'tasks.json'
save_in_json(data, way_to_file_tasks)