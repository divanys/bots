import os

def get_name(way):
    lst = os.listdir(way)
    return lst

# Пример использования
way = './tasks'  # Укажите путь к вашей директории tasks
lst_of_files = get_name(way)

for i in lst_of_files:
    print(i.replace('.java', '') + '\n')


