import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    //когда бот получает сообдение, выполняется этот метод
    public void onUpdateReceived(Update update) {

    }

    //получение иени бота
    public String getBotUsername() {
        return null;
    }

    //получение токена бота
    public String getBotToken() {
        return null;
    }
}
