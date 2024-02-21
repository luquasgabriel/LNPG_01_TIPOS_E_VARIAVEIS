main :: IO ()
main = do
    putStrLn "Enter the temperature in Celsius:"
    input <- getLine
    let celsiusTemperature = read input :: Double

    let fahrenheitTemperature = (celsiusTemperature * 1.8) + 32

    putStrLn $ "The temperature in Fahrenheit is: " ++ show fahrenheitTemperature
