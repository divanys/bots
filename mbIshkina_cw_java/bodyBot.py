# https://t.me/forkoshkina_bot


import logging
from aiogram import Bot, Dispatcher, types
from aiogram.types import ParseMode
from aiogram.types import InputFile
from aiogram.utils import executor
from aiogram import types
import json
import TOKEN

# Настройки бота
API_TOKEN = TOKEN.TOKEN

logging.basicConfig(level=logging.INFO)

# Инициализация бота и диспетчера
bot = Bot(token=API_TOKEN)
dp = Dispatcher(bot)

# Загружаем задачи из JSON
with open('tasks.json', 'r') as f:
    tasks = json.load(f)


# Функция для поиска решения задачи
def find_solution(task_text):
    task_text_lst = task_text.split()

    for key, item in tasks.items():
        if item == task_text_lst:
            return key


# Обработка команды /start
@dp.message_handler(commands=['start'])
async def on_start(message: types.Message):
    await message.reply("Привет! Я готов помочь тебе с задачей. Пожалуйста, отправь мне текст задачи.\n"
                        "Для удобства я присылаю текстовый файл с готовыми задачами, чтобы упростить "
                        "поиск задачи для себя. Бери текст именнно оттуда: мне важны все слова, запятые, "
                        "пробелы, точки. \nЗ.Ы. создателю лень запариваться с обработчиками "
                        "всего текста.")
    with open('./pz.txt', 'rb') as file:
        await message.reply_document(InputFile(file))

@dp.message_handler(commands=['divan'])
async def non_start(message: types.Message):
    await message.reply("Нет, блин, пуфик")

@dp.message_handler(commands=['koshkina'])
async def non_start(message: types.Message):
    await message.reply("Любимый препод🥺")

@dp.message_handler(commands=['divan_loh'])
async def ot_start(message: types.Message):
    await message.reply("Сама такая, лер")


# Обработка текстовых сообщений
@dp.message_handler(lambda message: message.text)
async def process_task(message: types.Message):
    task_text = message.text

    solution = f'./tasks/{find_solution(task_text)}.java'

    if solution != "./tasks/None.java":
        # Отправляем решение пользователю
        with open(solution, 'rb') as solution_file:
            await message.reply_document(InputFile(solution_file))
    else:
        await message.reply("Извините, решение для этой задачи не найдено. Возьмите текст из ранее присланного "
                            "файла или задача просто отсутствует.")


if __name__ == '__main__':
    executor.start_polling(dp, skip_updates=True)
