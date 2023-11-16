__config() -> {'scope'->'global','stay_loaded'->true};
__command() -> '';

1() -> (run('gamemode creative '+player()~'command_name');return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo'));
0() -> (run('gamemode survival '+player()~'command_name');return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo'));
3() -> (run('gamemode spectator '+player()~'command_name');return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo'));
2() -> (run('gamemode adventure '+player()~'command_name');return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo'))
