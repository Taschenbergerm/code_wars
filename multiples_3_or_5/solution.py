""" Multiples of 3 or 5 

Solution I
Use a list comprehension to filter all that are not dividable by 3 or 5 
sum up the list 
"""
import logging


def solution(number: int) -> int:
    """Find the sum of numbers which are lower than the input
    and multiples of 3 or 5
    """
    logging.debug(f"Input was {number}")
    multiples = [x for x in range(number) if is_multiple_of_3_or_5(x)]
    logging.debug(f"Identified {multiples} as multiples")
    result = sum(multiples)
    logging.info(f"Sum is {result}")
    return result


def is_multiple_of_3_or_5(x: int) -> bool:
    """ 
    Return if the number is divisible by 3 or 5 
    """
    is_multiple = x % 3 == 0 or x % 5 == 0
    logging.debug(f"Is {x} a multiple: {is_multiple}")
    return is_multiple
