//Imports
import et.telebof.BotClient;

//Inicio da classe
public class Samubott {
    //Token do bot - Para conseguir um, procure o BotFather no Telegram
    static final String TOKEN = "Seu_Token";
    //Inicio do metodo main
    public static void main(String[] args) {
        //Usa o TOKEN no metodo BotClient pra executar e colocar o bot on
        final BotClient bot = new BotClient(TOKEN);
        // Resposta ao comando /start
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            context.reply("Salve, eu sou o Samubott, como posso te ajudar?").exec();
        });
        bot.onMessage(filter -> filter.commands("help"), (context, message) -> {
            context.reply("Você selecionou o comando /help  \n O Samubott pode te auxiliar com perguntas, digite sua dúvida e uma resposta gerada por IA irá aparecer. :)").exec();
        });
        bot.run(); // Executa o bot0
    }
}
