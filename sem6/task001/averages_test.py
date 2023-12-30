"""Тестирование программы."""

from typing import Literal
import pytest
from sem6.task001.averages import NumsLists

@pytest.fixture
def list_1():
    """ Фикстура, возвращающая список co значениями [1, 2, 3, 4, 5]. """
    return [1, 2, 3, 4, 5]


@pytest.fixture
def list_2():
    """Аналогично."""
    return [2, 3, 4, 5, 6]


def test_init(list_1: list[int], list_2: list[int]):
    """Проверка корректной инициализации класса."""
    nums_list = NumsLists(list_1, list_2)
    assert nums_list.lst1 == list_1
    assert nums_list.lst2 == list_2


def test_get_lists_averages(list_1: list[int], list_2: list[int]):
    """Проверка средних значений списков размером больше 1."""
    nums_list = NumsLists(list_1, list_2)
    assert nums_list.get_lists_averages() == (3, 4)


@pytest.mark.parametrize('lst1, lst2, result', [([1, 2, 3], [], (2, 0)),
                                                ([], [1, 2, 3], (0, 2)),
                                                ([], [], (0, 0))])
def test_get_empty_lists_averages(lst1: list[int],
                                  lst2: list[int],
                                  result: tuple[Literal[2],
                                                Literal[0]] | tuple[Literal[0],
                                                Literal[2]] | tuple[Literal[0],
                                                                    Literal[0]]):
    """Проверка средних значений, если один или oba списка пустые."""
    nums_list = NumsLists(lst1, lst2)
    assert nums_list.get_lists_averages() == result


@pytest.mark.parametrize('lst1, lst2, result', [([1, 2, 3], [5], (2, 5)),
                                                ([5], [1, 2, 3], (5, 2)),
                                                ([5], [5], (5, 5))])
def test_get_one_elemented_lists_averages(lst1: list[int],
                                          lst2: list[int],
                                          result: tuple[Literal[2],
                                                        Literal[5]] | tuple[Literal[5],
                                                        Literal[2]] | tuple[Literal[5],
                                                                            Literal[5]]):
    """Проверка средних значений, если один или oba списка имеют только один элемент."""
    nums_list = NumsLists(lst1, lst2)
    assert nums_list.get_lists_averages() == result


def test_first_average_more(list_1: list[int],
                            list_2: list[int],
                            capfd: pytest.CaptureFixture[str]):
    """Проверка сообщения когда среднее значение первого списка больше второго."""
    nums_list = NumsLists(list_2, list_1)
    nums_list.compare_averages()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Первый список имеет большее среднее значение.'


def test_second_average_more(list_1: list[int],
                             list_2: list[int],
                             capfd: pytest.CaptureFixture[str]):
    """Проверка сообщения когда среднее значение второго списка больше первого."""
    nums_list = NumsLists(list_1, list_2)
    nums_list.compare_averages()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Второй список имеет большее среднее значение.'


def test_equal_averages(list_1: list[int],
                       capfd: pytest.CaptureFixture[str]):
    """Проверка сообщения когда средние значения списков равны."""
    nums_list = NumsLists(list_1, list_1)
    nums_list.compare_averages()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Средние значения равны.'
