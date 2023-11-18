
__config() -> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        '<mode>' -> _() -> 'mode'
    },
    'arguments' -> {
        'mode' -> {
            'type' -> 'int',
            'min' -> 0,
            'max' -> 3,
            'suggest' -> [0,1,2,3]
        }
    }
};

modify(player, '%s', '%s');return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo')
