SCRIPT_START
{
    NOP

    main_loop:
    WAIT 0
    PRINT_STRING_NOW "Sup world." 1000
    GOTO main_loop
}
SCRIPT_END