package pingoo04.crystalMod;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static pingoo04.crystalMod.Main.DEBUG;

public class Reference
{

    public static final String ModID = "crystal_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

    //region Logging
    public static final String ANSI_RESET = "\033[0m";  // Text Reset
    public static final String ANSI_BLACK = "\033[0;30m";   // BLACK
    public static final String ANSI_RED = "\033[0;31m";     // RED
    public static final String ANSI_GREEN = "\033[0;32m";   // GREEN
    public static final String ANSI_YELLOW = "\033[0;33m";  // YELLOW
    public static final String ANSI_BLUE = "\033[0;34m";    // BLUE
    public static final String ANSI_PURPLE = "\033[0;35m";  // PURPLE
    public static final String ANSI_CYAN = "\033[0;36m";    // CYAN
    public static final String ANSI_WHITE = "\033[0;37m";   // WHITE
    public static final String ANSI_BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String ANSI_RED_BACKGROUND = "\033[41m";    // RED
    public static final String ANSI_GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String ANSI_YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String ANSI_BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String ANSI_PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String ANSI_CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String ANSI_WHITE_BACKGROUND = "\033[47m";  // WHITE
    public static final String ANSI_BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String ANSI_RED_BRIGHT = "\033[0;91m";    // RED
    public static final String ANSI_GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String ANSI_YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String ANSI_BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String ANSI_PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String ANSI_CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String ANSI_WHITE_BRIGHT = "\033[0;97m";  // WHITE
    public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String ANSI_RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String ANSI_GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String ANSI_YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String ANSI_BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String ANSI_PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String ANSI_CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String ANSI_WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    public static void log(String message)
    {
        if(DEBUG)
            LOGGER.info(ANSI_PURPLE_BRIGHT + ">>> " + message + ANSI_RESET);
    }

    public static void logN(String message)
    {
        if(DEBUG)
            LOGGER.info(">>> " + message);
    }

    public static void logRGB256(String message, int r, int g, int b)
    {
        if(DEBUG)
            LOGGER.info("\033[38;2;" + r + ";" + g + ";" + b + "m>>> " + message + ANSI_RESET);
    }

    public static void logBackRGB256(String message, int rf, int gf, int bf, int rb, int gb, int bb)
    {
        if(DEBUG)
            LOGGER.info("\033[38;2;" + rf + ";" + gf + ";" + bf + ";48;2;" + rb + ";" + gb + ";" + bb + "m>>> " + message + " " + ANSI_RESET);
    }
    //endregion


    @NotNull
    public static Identifier identifier(@NotNull String path)
    {
        return new Identifier(ModID, path);
    }

    public static MutableText translate(String key, Object ... params)
    {
        return Text.translatable(ModID + "." + key, params);
    }

    public static class ModTags
    {
        public static class Blocks
        {

        }

        public static class Items
        {

        }

        public static class Entities
        {

        }
    }
}
