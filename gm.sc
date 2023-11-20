
__config() -> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        '<mode>' -> _(mode) -> (
            modify(player(), 'gamemode', mode);
            return(print(player(), format(['f [', 'y m', 't a', 'd i', 'g SMP', 'f ]', 'w  Gamemode cambiata.'])));
        )
    },
    'arguments' -> {
        'mode' -> {
            'type' -> 'int',
            'min' -> 0,
            'max' -> 3,
            'suggest' -> [0,1,2,3]
        };
    };
};
