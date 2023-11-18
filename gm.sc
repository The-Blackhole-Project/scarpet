
__config() -> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        '<mode>' -> _(mode) -> (modify(_, mode, mode);return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo'))
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
