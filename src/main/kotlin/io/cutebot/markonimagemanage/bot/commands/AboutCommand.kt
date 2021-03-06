package io.cutebot.markonimagemanage.bot.commands

import io.cutebot.markonimagemanage.bot.blocks.AboutBlock
import io.cutebot.telegram.bot.block.BotBlock
import io.cutebot.telegram.bot.command.Command
import io.cutebot.telegram.bot.model.RawMessage
import org.springframework.stereotype.Service

@Service
class AboutCommand(
        private val aboutBlock: AboutBlock
): Command {
    override fun handleCommand(query: String, message: RawMessage): BotBlock {
        return aboutBlock
    }

    override fun getCommand(): String {
        return "/about"
    }

    override fun getCommandDescription(): String {
        return "show about info"
    }

    override fun isSystemCommand(): Boolean {
        return true
    }
}
